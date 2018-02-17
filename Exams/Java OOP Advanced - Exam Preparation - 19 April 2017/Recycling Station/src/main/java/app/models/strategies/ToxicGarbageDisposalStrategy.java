package app.models.strategies;

import app.models.WasteData;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

public class ToxicGarbageDisposalStrategy implements GarbageDisposalStrategy {

    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double volume = garbage.getVolumePerKg() * garbage.getWeight();
        double energyBalance = volume * -0.13;
        double capitalBalance = volume * -0.65;

        return new WasteData(energyBalance, capitalBalance);
    }
}
