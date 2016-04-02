/**
 * Created by thorunn on 09/03/16.
 */
public class Search
{
    private String[] type = {"adventure", "citywalk", "horseriding", "hiking",  "sightseeing"};
    private String[] difficulty = {"easy", "medium", "hard"};
    private String[] area = {"Capital region", "east", "north", "south", "west"};
    private String[] language = {"danish", "english", "german", "icelandic", "spanish"};
    
	private Tours tour;

    public Tours getResults() { 
    	return tour; 
    }

}
