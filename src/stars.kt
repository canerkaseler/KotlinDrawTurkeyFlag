/**
 *
 * Created by CANER on 23/April/2020.
 * Contact info: canerbusiness@outlook.com
 */

fun main(){
    println()
    println()
    print("Caner Kaşeler:\n\"23 Nisan Ulusal Egemenlik ve Çocuk Bayramımız Kutlu Olsun..!\"")

    val flag = Flag()
    flag.drawFlagTurkeyRepublic()

    println("100 Yıl İçin Teşekkür Ederiz, Türkiye Cumhuriyeti Kurucusu Mustafa Kemal ATATÜRK.")
    println("\n\n\n\nBu kod @canerkaseler tarafından yazılmıştır.")
    println("\n\n\n\n\n\n\n\n\n\n")
}

class Flag{
    val marginTop = 3
    val marginBottom = 17

    fun drawFlagTurkeyRepublic(){

        for (y in 0..20) {
            println()
            for (x in 0..30) {
                if (y in marginTop..marginBottom){
                    if (isStar(x, y)) print(" * ")
                    else print("   ")
                }
                else print(" * ")
            }
        }
        println()
    }

    private fun isStar(xX:Int, yY:Int): Boolean {

        val marginLeft = 2
        val midPointVertical = 11
        val midPointHorizontal = 15

        return if (xX > midPointHorizontal) {

            if(yY == 6) {
                putSpace(xX, 18, 20)
            }
            else if(yY == 7) {
                putSpace(xX, 18, 21)
            }
            else if(yY == 8) {
                putSpace(xX, 18, 24)
            }
            else if(yY == 9){
                putSpace(xX, 17, 23)
            }
            else if(yY == 10){
                putSpace(xX, 15, 22)
            }
            else if(yY == 11) {
                putSpace(xX, 17, 23)
            }
            else if(yY == 12){
                putSpace(xX, 18, 24)
            }
            else if(yY == 13){
                putSpace(xX, 18, 21)
            }
            else if(yY == 14){
                putSpace(xX, 18, 20)
            }
            else return true
        }
        //left
        else if (xX > marginLeft && yY < midPointVertical) {
            //top

            if(yY == 3){
                putSpace(xX, 9, 14)
            }
            else if(yY == 4){
                putSpace(xX, 6, 11)
            }
            else if(yY == 5){
                putSpace(xX, 4, 10)
            }
            else if(yY == 6){
                putSpace(xX, 3, 9)
            }
            else if(yY == 7){
                putSpace(xX, 3, 8)
            }
            else if(yY == 8){
                putSpace(xX, 3, 7)
            }
            else if(yY == 9){
                putSpace(xX, 2, 7)
            }
            else if(yY == 10){
                putSpace(xX, 2, 7)
            }
            else return false

        }
        else if (xX > marginLeft && yY > midPointVertical - 1) {
            //bottom

            if(yY == 11){
                putSpace(xX, 2, 7)
            }
            else if(yY == 12){
                putSpace(xX, 3, 7)
            }
            else if(yY == 13){
                putSpace(xX, 3, 8)
            }
            else if(yY == 14){
                putSpace(xX, 3, 9)
            }
            else if(yY == 15){
                putSpace(xX, 4, 10)
            }
            else if(yY == 16){
                putSpace(xX, 6, 11)
            }
            else if(yY == 17){
                putSpace(xX, 9, 14)
            }
            else return false
        }
        else return true
    }

    private fun putSpace(pointX:Int, start:Int, finish:Int): Boolean{
        return pointX !in (start + 1) until finish
    }
}

