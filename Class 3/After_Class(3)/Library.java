public class Library{
    
    float celsius;
    float fahr;
    float kelvin;
    
    
    public Library(float celsius, float fahr, float kelvin){
        this.celsius = celsius;
        this.fahr = fahr;
        this.kelvin = kelvin;
    }
    void celsiusToKelvin(){
        kelvin = celsius + 273.15f;
    }
    void celsiusToFahr(){
        fahr = celsius*1.8f+32;
    }
    void fahrToCelsius(){
        celsius = (fahr-32)*0.5556f;
    }
    void fahrToKelvin(){
        kelvin = (fahr+459.67f) * 0.5556f;
    }
    void kelvinToFahr(){
        fahr = 1.8f*(kelvin-273)+32;
    }
    void kelvinToCelsius(){
        celsius = kelvin - 273.15f;
    }
    void reset(){
        celsius = 0f;
        kelvin = 0f;
        fahr = 0f;
    }
    void DisplayInfo(){
        System.out.println("====================");
        System.out.println("Celsius: "+celsius);
        System.out.println("Kelvin: "+kelvin);
        System.out.println("Fahrenheit: "+fahr);
        System.out.println("====================");
    }
}