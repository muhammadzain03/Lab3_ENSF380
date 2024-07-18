package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private Story[] story;

    public String storyOrder() {
        return "Method storyOrder called from Anthology";
    }

    public Story[] getStory() {
        return story;
    }

    public void setStory(Story[] stories) {
        this.story = stories;
    }
}
