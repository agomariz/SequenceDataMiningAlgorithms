package agp.spmf.algorithms.sequentialpatterns.spade_spam_AGP.idLists.creators;

import java.util.List;

import agp.spmf.algorithms.sequentialpatterns.spade_spam_AGP.idLists.IDList;
import agp.spmf.algorithms.sequentialpatterns.spade_spam_AGP.idLists.IDListBitmap;

/**
 * Creator of a IdList based on a hashmap of bitmaps.
 *
 * Copyright Antonio Gomariz Peñalver 2013
 *
 * This file is part of the SPMF DATA MINING SOFTWARE
 * (http://www.philippe-fournier-viger.com/spmf).
 *
 * SPMF is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * SPMF is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * SPMF. If not, see <http://www.gnu.org/licenses/>.
 *
 * @author agomariz
 */
public class IdListCreator_Bitmap implements IdListCreator{
    
    /**
     * Static reference in order to make the class singleton.
     */
    private static IdListCreator_Bitmap instance = null;

    /**
     * It removes the static fields.
     */
    public static void clear() {
        instance=null;
    }

    /**
     * Standard Constructor.
     */
    private IdListCreator_Bitmap() {
        super();
    }

    /**
     * Get the static instance of the singleton IdList based on bitmaps.
     * @return the instance
     */
    public static IdListCreator getInstance() {
        if (instance == null) {
            instance = new IdListCreator_Bitmap();
        }
        return instance;
    }

    /**
     * It creates an empty IdList of entries of bitsets.
     * @return  the created idlist
     */
    @Override
    public IDList create() {
        IDListBitmap bitmap = new IDListBitmap();
        return bitmap;
    }

    /**
     * It adds to an Idlist of entries of bitsets an appearance <sid,tid>
     */
    @Override
    public void addAppearance(IDList idlist, Integer sequence, Integer timestamp) {
        IDListBitmap id = (IDListBitmap)idlist;
        id.registerBit(sequence, timestamp);
    }

    /**
     * It adds several appearances in a same
     * sequence <sid, {tid_1,tid_2,...,tid_n}> to an Idlist of entries of bitsets 
     */
    @Override
    public void addAppearancesInSequence(IDList idlist, Integer sequence, List<Integer> itemsets) {
        IDListBitmap id = (IDListBitmap) idlist;
        id.addAppearancesInSequence(sequence, itemsets);
    }
    
}
