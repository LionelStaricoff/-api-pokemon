
package ar.com.codoacodo.item;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "effect",
    "language",
    "short_effect"
})
@Generated("jsonschema2pojo")
public class EffectEntry {

    @JsonProperty("effect")
    public String effect;
    @JsonProperty("language")
    public Language language;
    @JsonProperty("short_effect")
    public String shortEffect;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EffectEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effect");
        sb.append('=');
        sb.append(((this.effect == null)?"<null>":this.effect));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("shortEffect");
        sb.append('=');
        sb.append(((this.shortEffect == null)?"<null>":this.shortEffect));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
