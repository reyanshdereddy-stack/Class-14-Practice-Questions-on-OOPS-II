class Dataset {
private double sum;
private double[] data;
private int Datasize;

public Dataset(){
    data = new double[100];
    Datasize=0;
    sum=0;

}
public void add(double value){
    data[Datasize]=value;
    Datasize++;
    sum += value;
}
public double getAverage(){
    return (Datasize == 0) ? 0 : sum/Datasize;
}
public double getStandardDeviation(){
    double mean = getAverage();
    double sumofsquares = 0;
    for(int i=0; i < Datasize; i++){
    double diff = data[i]-mean;
    sumofsquares += diff * diff;
}
return Math.sqrt(sumofsquares/Datasize);
}
public static double calculateAverage(Dataset[] datasets){
    double total = 0;
    for(Dataset ds : datasets){
        total = ds.getAverage();
    }
    return total /datasets.length;

}
@Override
public String toString(){
    return "Dataset[Size"+Datasize+",Average "+getAverage()+"]";
}

}