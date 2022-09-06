package unlam.grupo102.StockerTracking.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import unlam.grupo102.StockerTracking.models.pojo.Pedido;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockerPedidoResponse implements Serializable {

    private boolean ok;
    private Pedido pedido;
    private String total;
    private ErrorRest error;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ErrorRest getError() {
        return error;
    }

    public void setError(ErrorRest error) {
        this.error = error;
    }
}
