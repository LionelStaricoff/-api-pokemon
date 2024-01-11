
package ar.com.codoacodo.pokeapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dream_world",
    "home",
    "official-artwork",
    "showdown"
})

public class Other {

    @JsonProperty("dream_world")
    public DreamWorld dreamWorld;
    @JsonProperty("home")
    public Home home;
    @JsonProperty("official-artwork")
    public OfficialArtwork officialArtwork;
    @JsonProperty("showdown")
    public Showdown showdown;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Other.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dreamWorld");
        sb.append('=');
        sb.append(((this.dreamWorld == null)?"<null>":this.dreamWorld));
        sb.append(',');
        sb.append("home");
        sb.append('=');
        sb.append(((this.home == null)?"<null>":this.home));
        sb.append(',');
        sb.append("officialArtwork");
        sb.append('=');
        sb.append(((this.officialArtwork == null)?"<null>":this.officialArtwork));
        sb.append(',');
        sb.append("showdown");
        sb.append('=');
        sb.append(((this.showdown == null)?"<null>":this.showdown));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
