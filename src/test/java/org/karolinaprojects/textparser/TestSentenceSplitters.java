package org.karolinaprojects.textparser;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestSentenceSplitters {
    @Test
    public void testSentenceSplitter(){
        String text = "Nic nie działało. Antek pochylał się nad synem i stroił coraz to inne miny. " +
                "– Pamiętasz tego starego Łęgę, co przychodził pod bramę z saksofonem? " +
                "– zapytał Wichowskiego.";
        List<String> expected = new ArrayList<>();
        expected.add("Nic nie działało. ");
        expected.add("Antek pochylał się nad synem i stroił coraz to inne miny. ");
        expected.add("– Pamiętasz tego starego Łęgę, co przychodził pod bramę z saksofonem? ");
        expected.add("– zapytał Wichowskiego.");
        Splitter splitter = new SentenceSplitter();
        List<String> result = splitter.split(text);

        assertEquals(result,expected);
    }

    @Test
    public void testMySentenceSplitter(){
        String text = "Nic nie działało. Antek pochylał się nad synem i stroił coraz to inne miny. " +
                "– Pamiętasz tego starego Łęgę, co przychodził pod bramę z saksofonem? " +
                "– zapytał Wichowskiego.";
        List<String> expected = new ArrayList<>();
        expected.add("Nic nie działało.");
        expected.add(" Antek pochylał się nad synem i stroił coraz to inne miny.");
        expected.add(" – Pamiętasz tego starego Łęgę, co przychodził pod bramę z saksofonem?");
        expected.add(" – zapytał Wichowskiego.");
        Splitter splitter = new MySentenceSplitter();
        List<String> result = splitter.split(text);

        assertEquals(result.size(),expected.size());
    }


}
