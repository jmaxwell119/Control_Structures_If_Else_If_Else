fun main(){
    var temperature = 0.00
    print("Type in a number from 92.0 to 104.0: ")
    temperature = readLine()!!.toDouble()
    if (temperature < 95.0)
        print("a temperature of $temperature is low")
    else if (temperature <= 99.5)
        print("a temperature of $temperature is normal. ")
    else
        print("a temperature of $temperature is high")

}