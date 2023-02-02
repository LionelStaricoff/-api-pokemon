
package ar.com.codoacodo.pokeapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "back_default",
    "back_shiny",
    "back_shiny_transparent",
    "back_transparent",
    "front_default",
    "front_shiny",
    "front_shiny_transparent",
    "front_transparent"
})

public class Crystal {

    @JsonProperty("back_default")
    public String backDefault;
    @JsonProperty("back_shiny")
    public String backShiny;
    @JsonProperty("back_shiny_transparent")
    public String backShinyTransparent;
    @JsonProperty("back_transparent")
    public String backTransparent;
    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_shiny")
    public String frontShiny;
    @JsonProperty("front_shiny_transparent")
    public String frontShinyTransparent;
    @JsonProperty("front_transparent")
    public String frontTransparent;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Crystal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("backDefault");
        sb.append('=');
        sb.append(((this.backDefault == null)?"<null>":this.backDefault));
        sb.append(',');
        sb.append("backShiny");
        sb.append('=');
        sb.append(((this.backShiny == null)?"<null>":this.backShiny));
        sb.append(',');
        sb.append("backShinyTransparent");
        sb.append('=');
        sb.append(((this.backShinyTransparent == null)?"<null>":this.backShinyTransparent));
        sb.append(',');
        sb.append("backTransparent");
        sb.append('=');
        sb.append(((this.backTransparent == null)?"<null>":this.backTransparent));
        sb.append(',');
        sb.append("frontDefault");
        sb.append('=');
        sb.append(((this.frontDefault == null)?"<null>":this.frontDefault));
        sb.append(',');
        sb.append("frontShiny");
        sb.append('=');
        sb.append(((this.frontShiny == null)?"<null>":this.frontShiny));
        sb.append(',');
        sb.append("frontShinyTransparent");
        sb.append('=');
        sb.append(((this.frontShinyTransparent == null)?"<null>":this.frontShinyTransparent));
        sb.append(',');
        sb.append("frontTransparent");
        sb.append('=');
        sb.append(((this.frontTransparent == null)?"<null>":this.frontTransparent));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
