package kr.co.tjoeun.a20191208_03_listviewpractice.datas

class User(inputName:String, inputAddress:String, isWomenOk:Boolean) {

    var name = inputName
    var address = inputAddress
    var isWomen = isWomenOk

    constructor() :  this("미정", "거주지 불명", false)

}