package Simple;

public class Mixer {
    double coldTemp = 15;
    double hotTemp = 60;
    int cold = 0;
    int hot = 0;


    public void setValues(int cold, int hot) {
        this.cold = cold;
        this.hot = hot;
    }

    public double getTemp() {
        return (cold * coldTemp + hot * hotTemp) / (cold + hot);
    }
}
