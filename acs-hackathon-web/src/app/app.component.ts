import {Component, OnInit, ViewChild} from '@angular/core';
import {GoogleMap, MapInfoWindow} from '@angular/google-maps';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  @ViewChild(GoogleMap, { static: false }) map: GoogleMap;
  @ViewChild(MapInfoWindow, { static: false }) info: MapInfoWindow;
  title = 'acs-hackathon-web';
  zoom = 12;
  center: google.maps.LatLngLiteral;
  options: google.maps.MapOptions = {
    mapTypeId: 'hybrid',
    zoomControl: true,
    scrollwheel: false,
    disableDoubleClickZoom: true,
    maxZoom: 15,
    minZoom: 8
  };
  markers = [];
  infoContent = '';

  public constructor() {
  }

  ngOnInit() {
    /*navigator.geolocation.getCurrentPosition(position => {
      this.center = {
        lat: position.coords.latitude,
        lng: position.coords.longitude,
      };
    });*/
    navigator.geolocation.getCurrentPosition(x => {
      this.center = {
        lat: x.coords.latitude,
        lng: x.coords.longitude
      };
      this.markers.push({
        position: {
          lat: x.coords.latitude,
          lng: x.coords.longitude
        },
        label: {
          color: 'blue',
          text: 'Marker Label'
        },
        title: 'Marker Title',
        info: 'Marker info',
        options: {
          animation: google.maps.Animation.BOUNCE
        }
      });
    },
    err => {
      console.log(err);
    });
  }

  zoomIn() {
    if (this.zoom < this.options.maxZoom) {
      this.zoom++;
    }
  }

  zoomOut() {
    if (this.zoom > this.options.minZoom) {
      this.zoom--;
    }
  }

  addMarker() {
    this.markers.push({
      position: {
        lat: this.center.lat + ((Math.random() - 0.5) * 2) / 10,
        lng: this.center.lng + ((Math.random() - 0.5) * 2) / 10
      },
      label: {
        color: 'red',
        text: 'Marker label ' + (this.markers.length + 1)
      },
      title: 'Marker title ' + (this.markers.length + 1),
      info: 'Marker info ' + (this.markers.length + 1),
      options: {
        animation: google.maps.Animation.BOUNCE
      }
    });
  }

  public getAddress() {}
  public getAddressFromLatLng() {}
}
