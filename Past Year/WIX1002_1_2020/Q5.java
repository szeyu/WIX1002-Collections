package WIX1002_1_2020;

class Cloud{
    protected final String cloudPackage;
    private double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Cloud(String cloudPackage) {
        this.cloudPackage = cloudPackage;
    }

    @Override
    public String toString(){
        return "Cloud Package : " + cloudPackage +
                " Total Cost= " + totalCost;
    }
}

class Job{
    private String jobName;
    private int numberOfTasks;
    private int memory;

    public String getJobName() {
        return jobName;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public int getMemory() {
        return memory;
    }

    public Job(String jobName, int numberOfTasks, int memory) {
        this.jobName = jobName;
        this.numberOfTasks = numberOfTasks;
        this.memory = memory;
    }

    @Override
    public String toString(){
        return "Job Name : " + jobName +
                " Memory = " + memory + "GB" +
                " Number of Task = " + numberOfTasks;
    }
}

class CloudPackage extends Cloud{
    private int numberOfCore;
    private int memory;
    private double pricePerHour;

    public CloudPackage(String cloudPackage, int numberOfCore, int memory, double pricePerHour) {
        super(cloudPackage);
        this.numberOfCore = numberOfCore;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }

    public boolean check(Job job){
        return memory >= job.getMemory();
    }

    public double totalCost(Job job){
        return (double)job.getNumberOfTasks()/numberOfCore * pricePerHour;
    }
}

public class Q5 {
    public static void main(String[] args) {
        CloudPackage c1 = new CloudPackage("P2-15",4,15,1.24);
        CloudPackage c2 = new CloudPackage("P2-30",6,30,2.11);
        CloudPackage c3 = new CloudPackage("R5-30",4,20,1.38);
        CloudPackage c4 = new CloudPackage("R6-20",6,20,1.88);
        CloudPackage[] cloudPackages = {c1, c2, c3, c4};

        Job J1 = new Job("J1",252,20);
        Job J2 = new Job("J2",108,10);
        Job J3 = new Job("J3",72,25);
        Job[] jobs = {J1, J2, J3};


        // initialise the best package to the package which is valid in term of memory
        CloudPackage[] bestPackage = new CloudPackage[3];
        for(int i = 0; i < jobs.length; i++){
            for(CloudPackage cloudPackage : cloudPackages){
                if(cloudPackage.check(jobs[i])){
                    bestPackage[i] = cloudPackage;
                    break;
                }
            }

        }

        for (int i = 0; i < jobs.length; i++){
            for (int j = 0; j < cloudPackages.length; j++) {
                if(cloudPackages[j].check(jobs[i])) {

                    //System.out.println(bestPackage[i].cloudPackage + " : " + bestPackage[i].totalCost(jobs[i]));
                    //System.out.println(cloudPackages[j].cloudPackage + " : " + cloudPackages[j].totalCost(jobs[i]));

                    if (bestPackage[i].totalCost(jobs[i]) >= cloudPackages[j].totalCost(jobs[i])) {
                        bestPackage[i] = cloudPackages[j];
                        cloudPackages[j].setTotalCost(bestPackage[i].totalCost(jobs[i]));
                    }
                }
            }
        }

        for (int i = 0; i < jobs.length; i++) {
            System.out.println(jobs[i].toString());
            System.out.println(bestPackage[i].toString());
        }
    }
}
