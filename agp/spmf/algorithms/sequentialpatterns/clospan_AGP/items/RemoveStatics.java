package agp.spmf.algorithms.sequentialpatterns.clospan_AGP.items;

import agp.spmf.algorithms.sequentialpatterns.clospan_AGP.items.abstractions.Abstraction_Qualitative;
import agp.spmf.algorithms.sequentialpatterns.clospan_AGP.items.creators.ItemAbstractionPairCreator;
import agp.spmf.algorithms.sequentialpatterns.clospan_AGP.items.patterns.PatternCreator;



/**
 *
 * @author antonio
 */
public class RemoveStatics {

    public static void clear() {
        ItemAbstractionPairCreator.sclear();
        Abstraction_Qualitative.clear();
        PatternCreator.sclear();
    }
}
