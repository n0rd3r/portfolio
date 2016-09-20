#!/usr/bin/env node
var http = require('http');
var data = '';
var lat = process.env.LAT;
var lon = process.env.LON;
var opt = {};
opt.headers = {};
opt.headers["User-Agent"] = "norjekudo software llc";
opt.hostname = 'forecast.weather.gov';
opt.path = '/MapClick.php?lat=' + lat + '&lon=' + lon + '&FcstType=json';
http.get(opt, function (response) {
    response.on('data', function(chunk) {
        data += chunk;
    });
    response.on('end', function() {
        var wx = JSON.parse(data);
        console.log(wx.currentobservation.id);
        console.log('DATE: ' + wx.currentobservation.Date);
        console.log('WX: ' + wx.currentobservation.Weather);
        console.log('TEMP: ' + wx.currentobservation.Temp + 'F');
        console.log('DEWP: ' + wx.currentobservation.Dewp + 'F');
        console.log('Wind: ' + wx.currentobservation.Winds + 'mph from ' + wx.currentobservation.Windd);
        for (var i = 0; i < 3; i++) {
            console.log(wx.time.startPeriodName[i] + ': ' + wx.data.text[i].replace(/\.\s+/g, '.\n\t'));
        }
    });
});
