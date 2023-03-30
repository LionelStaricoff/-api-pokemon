
package ar.com.codoacodo.item;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attributes",
    "baby_trigger_for",
    "category",
    "cost",
    "effect_entries",
    "flavor_text_entries",
    "fling_effect",
    "fling_power",
    "game_indices",
    "held_by_pokemon",
    "id",
    "machines",
    "name",
    "names",
    "sprites"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("attributes")
    public List<Attribute> attributes;
    @JsonProperty("baby_trigger_for")
    public Object babyTriggerFor;
    @JsonProperty("category")
    public Category category;
    @JsonProperty("cost")
    public Integer cost;
    @JsonProperty("effect_entries")
    public List<EffectEntry> effectEntries;
    @JsonProperty("flavor_text_entries")
    public List<FlavorTextEntry> flavorTextEntries;
    @JsonProperty("fling_effect")
    public Object flingEffect;
    @JsonProperty("fling_power")
    public Integer flingPower;
    @JsonProperty("game_indices")
    public List<GameIndex> gameIndices;
    @JsonProperty("held_by_pokemon")
    public List<HeldByPokemon> heldByPokemon;
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("machines")
    public List<Object> machines;
    @JsonProperty("name")
    public String name;
    @JsonProperty("names")
    public List<Name> names;
    @JsonProperty("sprites")
    public Sprites sprites;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null)?"<null>":this.attributes));
        sb.append(',');
        sb.append("babyTriggerFor");
        sb.append('=');
        sb.append(((this.babyTriggerFor == null)?"<null>":this.babyTriggerFor));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("cost");
        sb.append('=');
        sb.append(((this.cost == null)?"<null>":this.cost));
        sb.append(',');
        sb.append("effectEntries");
        sb.append('=');
        sb.append(((this.effectEntries == null)?"<null>":this.effectEntries));
        sb.append(',');
        sb.append("flavorTextEntries");
        sb.append('=');
        sb.append(((this.flavorTextEntries == null)?"<null>":this.flavorTextEntries));
        sb.append(',');
        sb.append("flingEffect");
        sb.append('=');
        sb.append(((this.flingEffect == null)?"<null>":this.flingEffect));
        sb.append(',');
        sb.append("flingPower");
        sb.append('=');
        sb.append(((this.flingPower == null)?"<null>":this.flingPower));
        sb.append(',');
        sb.append("gameIndices");
        sb.append('=');
        sb.append(((this.gameIndices == null)?"<null>":this.gameIndices));
        sb.append(',');
        sb.append("heldByPokemon");
        sb.append('=');
        sb.append(((this.heldByPokemon == null)?"<null>":this.heldByPokemon));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("machines");
        sb.append('=');
        sb.append(((this.machines == null)?"<null>":this.machines));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("sprites");
        sb.append('=');
        sb.append(((this.sprites == null)?"<null>":this.sprites));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
