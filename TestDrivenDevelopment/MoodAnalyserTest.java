package TestDrivenDevelopment;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {


    @Test
public void testMoodAnalysis() throws Exception{
    MoodAnalyser ma = new MoodAnalyser();
    String mood = ma.analysemood("This is a sad msg");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
}
}