package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto que representa a sensibiliza\u00E7\u00E3o do saldo
 **/

@ApiModel(description = "Objeto que representa a sensibiliza\u00E7\u00E3o do saldo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SensibilizarSaldoGlobalUpdate   {
  
  private BigDecimal valor = null;

  
  /**
   * Quantidade que deve ser sensibilizada
   **/
  public SensibilizarSaldoGlobalUpdate valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quantidade que deve ser sensibilizada")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensibilizarSaldoGlobalUpdate sensibilizarSaldoGlobalUpdate = (SensibilizarSaldoGlobalUpdate) o;
    return Objects.equals(this.valor, sensibilizarSaldoGlobalUpdate.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensibilizarSaldoGlobalUpdate {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

