import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class GiphyService {

  giphyApi = '//api.giphy.com/v1/gifs/search?api_key=nOTRbUNMgD5mj4XowN2ERoPNudAkK6ft&limit=1&q=';

  constructor(public http: HttpClient) {
  }

  get(searchTherm) {
    const apiLink = this.giphyApi + searchTherm;
    return this.http.get(apiLink).pipe(map((response: any) => {
      if (response.data.length > 0) {
        return response.data[0].images.original.url;
      } else {
        return 'https://media.giphy.com/media/YaOxRsmrv9IeA/giphy.gif';
      }
    }));
  }
}
