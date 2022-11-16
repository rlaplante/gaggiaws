package com.eberlue.gaggia.ws


import grails.rest.*
import grails.converters.*
import java.text.SimpleDateFormat

class DataController {
	static responseFormats = ['json', 'xml']
	
    def index() {

    String caller = (params.caller ? params.caller : "first")
    String extraData = "this is extra stuff" 
    String strTime = ""

    Date date = new Date()
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
    strTime =  sdf.format(date)


String data = """
{
    "error": false,
    "category": "Christmas",
    "type": "twopart",
    "extra": "${extraData}",
    "time": "${strTime}",
    "caller":"${caller}",
    "setup": "Que va aussi vite que le train ?",
    "delivery": "Le gars motive (locomotive)!",
    "flags": {
        "nsfw": false,
        "religious": false,
        "political": false,
        "racist": false,
        "sexist": false,
        "explicit": false
    },
    "id": 252,
    "safe": true,
    "lang": "en"
}"""

render(data)

}
}
