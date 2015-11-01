public class Character {
    //Declare stat variables
    private int[] attributes =     {0,0,0,0,0,0};
    private int[] attmod =         {0,0,0,0,0,0};
    private int BAB, fortitude, reflex, will;
    private int AC, resist;

    public Character() {
        attributes[0] = roll(4, 6, 3);
        attributes[1] = roll(4, 6, 3);
        attributes[2] = roll(4, 6, 3);
        attributes[3] = roll(4, 6, 3);
        attributes[4] = roll(4, 6, 3);
        attributes[5] = roll(4, 6, 3);
        
    }
    
    //Pick Race from 3 groups
    //1. Basic
    //2. Untrusted
    //3. Monster
    
    
    //Pick Class from 3 groups
    //1. Core
    //2. Advanced
    //3. NPC
    
    //Pick base Type from array
    //1. Adept
    //2. Aristocrat
    //3. Commoner
    //4. Expert
    //5. Spellcaster
    //6. Warrior
    
    //For all but expert, pick subtype array.
    
    //Pick Class from array.
    //(Not all classes are available to all races)
    
    //Pick the character level.
    
    //Other choices may be necessary (Undecided as of yet)
    
    //Decide whether to print information to text file and to
    // which text file. Additional info can be added manually.
    
    
    
    
    
    
    
    
    
    
    //Character class will roll. This allows modifiers to be added and such.
    public static int roll(int num, int sides) {
        int result = 0;
        for(int i = 0; i < num; i++) {
            result += (int)(Math.random() * sides) + 1;
        }
        return result;
    }
    
    public static int roll(int num, int sides, int best) { //For rolling multiple dice and selecting best.
        int[] results = new int[num];
        int temp = 0;
        for(int i = 0; i < num; i++) {
            results[i] += (int)(Math.random() * sides) + 1;
        }
        for(int j = 0; j < num; j++) {
            for(int k = j + 1; k < num; k++){
                if (results[j] < results[k]) {
                    temp = results[j];
                    results[j] = results[k];
                    results[k] = temp;
                }
            }
        }
        temp = 0;
        for(int l = 0; l < best; l++){
            temp += results[l];
        }
        return temp;
    }
}
