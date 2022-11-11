
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "back_default",
    "back_gray",
    "back_transparent",
    "front_default",
    "front_gray",
    "front_transparent"
})

public class RedBlue {

    @JsonProperty("back_default")
    public String backDefault;
    @JsonProperty("back_gray")
    public String backGray;
    @JsonProperty("back_transparent")
    public String backTransparent;
    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_gray")
    public String frontGray;
    @JsonProperty("front_transparent")
    public String frontTransparent;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RedBlue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("backDefault");
        sb.append('=');
        sb.append(((this.backDefault == null)?"<null>":this.backDefault));
        sb.append(',');
        sb.append("backGray");
        sb.append('=');
        sb.append(((this.backGray == null)?"<null>":this.backGray));
        sb.append(',');
        sb.append("backTransparent");
        sb.append('=');
        sb.append(((this.backTransparent == null)?"<null>":this.backTransparent));
        sb.append(',');
        sb.append("frontDefault");
        sb.append('=');
        sb.append(((this.frontDefault == null)?"<null>":this.frontDefault));
        sb.append(',');
        sb.append("frontGray");
        sb.append('=');
        sb.append(((this.frontGray == null)?"<null>":this.frontGray));
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
