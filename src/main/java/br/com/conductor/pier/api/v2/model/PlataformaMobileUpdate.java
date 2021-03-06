package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto PlataformaMobile
 **/

@ApiModel(description = "Objeto PlataformaMobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlataformaMobileUpdate   {
  
  private String nome = null;

  
  /**
   * Nome da Plataforma
   **/
  public PlataformaMobileUpdate nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome da Plataforma")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlataformaMobileUpdate plataformaMobileUpdate = (PlataformaMobileUpdate) o;
    return Objects.equals(this.nome, plataformaMobileUpdate.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlataformaMobileUpdate {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

