
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_stat",
    "effort",
    "stat"
})

public class Stat {

    @JsonProperty("base_stat")
    public Integer baseStat;
    @JsonProperty("effort")
    public Integer effort;
    @JsonProperty("stat")
    public Stat__1 stat;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseStat");
        sb.append('=');
        sb.append(((this.baseStat == null)?"<null>":this.baseStat));
        sb.append(',');
        sb.append("effort");
        sb.append('=');
        sb.append(((this.effort == null)?"<null>":this.effort));
        sb.append(',');
        sb.append("stat");
        sb.append('=');
        sb.append(((this.stat == null)?"<null>":this.stat));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
