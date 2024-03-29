public class DataSetGen<T extends Measurable> {
    private double sum;
    private T maximum;
    private int count;

    public DataSetGen() {
        sum =0;
        maximum = null;
        count = 0;
    }

    public void add(T x){
        sum = sum + x.getMeasure();
        if(count == 0 || maximum.getMeasure() < x.getMeasure()){
            maximum = x;
        }
        count++;
    }

    public T getMaximum() {
        return maximum;
    }

    public double getAverage() {
        if (count == 0)
            return 0;
        else{
            return sum/count;
        }
    }

}
