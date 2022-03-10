fun fruit(name:String, lastName: String?) {
    if (lastName == null){
        println("This $name")
    } else {
        println("This $name, is color $lastName")
    }


}
fun main(){
    fruit("Banana","Yellow")
    fruit("Avocado","Green")
    fruit("Grape","null")
    fruit("Appel","Red")
}