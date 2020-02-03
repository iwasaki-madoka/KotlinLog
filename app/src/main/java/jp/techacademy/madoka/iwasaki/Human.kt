package jp.techacademy.madoka.iwasaki

import android.util.Log

class Human: Animal, Thinkable {
    // プロパティ
    var hobby: String

    // コンストラクタ
    constructor(name: String, age: Int, hobby: String) : super(name, age){
        this.hobby = hobby
    }

    // Animalクラスの抽象メソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "「私の名前は" + this.name + "です。"
                    + "年は" + this.age + "歳です。」")
    }

    // Thinkableインターフェースのメソッドを実装
    override fun think() {
        Log.d("kotlintest", "「私は" + this.hobby + "について考える。」")
    }
}