class Main {
    public static void main(String[] args) {
    Dataset dataset = new Dataset();
    dataset.add(10);
    dataset.add(12);
    dataset.add(14);
    dataset.add(16);
    dataset.add(18);
    System.out.println("Standard Deviation:"+dataset.getStandardDeviation());
    Dataset[] datasets = new Dataset[3];
    Dataset ds1 = new Dataset();
    ds1.add(2);
    ds1.add(4);
    ds1.add(6);
    Dataset ds2 = new Dataset();
    ds2.add(1);
    ds2.add(3);
    ds2.add(5);
    Dataset ds3 = new Dataset();
    ds3.add(10);
    ds3.add(20);
    datasets[0]=ds1;
    datasets[1]=ds2;
    datasets[2]=ds3;
    System.out.println("Average of Averages:"+Dataset.calculateAverage(datasets));
    }

    
}
