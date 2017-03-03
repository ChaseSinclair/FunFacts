package com.chase.funfacts;

import java.util.Random;

/**
 * Created by Chase on 4/12/2015.
 */
public class FactBook {

    //Member variables
    public String[] mFacts = {
            "Julian Glover, who plays Grand Maester Pycelle, played General Maximilian Veers in Star Wars: The Empire Strikes Back.",
            "GoT is filmed in 6 different countries including United States, Croatia, Morocco, Malta, Iceland and Northern Ireland.",
            "Through Season 4, 456 deaths have occurred on screen.",
            "HBO has stated that it costs approximately $6 million to make each episode.",
            "The original pilot episode, which has never been aired, featured different actors for Daenerys Targaryen and Catelyn Stark.",
            "More than 150 babies were named “Khaleesi” in 2012.",
            "Sophie Turner, who plays Sansa Stark, adopted the dog that played her dire wolf in the show. The dog is named Zunni.",
            "Daenery’s brother Viserys is the great-great grandson of Charles Dickens.",
            "The actor who plays Theon, Alfie Allen, is the brother of Lily Allen.",
            "Peter Dinklage was George R.R. Martin’s first choice for Tyrion.",
            "Jack Gleeson, aka Joffrey, played a little kid in Batman Begins.",
            "George R.R. Martin revealed the ending of the book series to the television show’s producers D.B. Weiss and David Benioff when they guessed who Jon Snow's mother was.",
            "The actor who plays Maester Aemon of the Night’s Watch is legally blind in real life, like the character he portrays in the television show.",
            "The Wall is based on Hadrian’s Wall of Roman Britain.",
            "The actress who plays Catelyn Stark, Michelle Fairley, played Mrs. Granger in Harry Potter and the Deathly Hallows.",
            "Emelia Clark (Daenerys) voiced Dr. Zoidberg’s girlfriend on Futurama.",
            "The rotating rings seen during the title sequence portray the Doom of Valyria, Robert Baratheon’s Rebellion and Robert Baratheon’s victory.",
            "Glamdring, the sword of Gandalf from Lord of the Rings, is embedded in the Iron Throne.",
            "Linguistics expert David Peterson created the Dothraki language for the series, which now consists of over 3000 words.",
            "The producers originally considered making “The Rains of Castamere” the Game of Thrones opening credits theme song.",
            "The Stangford Castle Ward Estate of County Down, Northern Ireland was used as the castle of Winterfell.",
            "Game of Thrones is the most pirated show in the world.",
            "Not a single character has appeared in every episode.",
            "Season 1 averaged 2 million viewers per episode; by Season 4, it had increased to nearly 7 million.",
            "Lena Headey (Cersei Lannister) played Queen Gorgo, the queen of Sparta in 300."
    };

    //Methods
    public String getFact() {
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        return fact;
    }
}
