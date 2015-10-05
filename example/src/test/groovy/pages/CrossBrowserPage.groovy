package pages

import geb.Page

class CrossBrowserPage extends Page {

    // // 故意定義錯的檢查條件
    static at = {$('#main h1').first().text() == 'Cross Browser Automation2'}

    static url = "http://www.gebish.org/crossbrowser"

    static content = {
        topic3 { $('#main h1').last().text() }
    }
}

