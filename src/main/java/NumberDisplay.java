package src.main.java;

public class NumberDisplay{
    private int value;
    private int limit;
    public NumberDisplay(int limit){
        this.limit = limit;
        this.value = 0;
    }
    public void setValue(int value){
        if (value >= 0 && value < limit){
            this.value = value;
        }
    }
    public int getValue(){
        return value;
    }
    public String getDisplayValue()
}
