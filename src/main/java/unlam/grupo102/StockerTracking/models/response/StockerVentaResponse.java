package unlam.grupo102.StockerTracking.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import unlam.grupo102.StockerTracking.models.pojo.Venta;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockerVentaResponse implements Serializable {

    private boolean ok;

    private Venta venta;
    private String total;
    private ErrorRest error;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
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

    public String toStringError() {
        return "StockerVentaResponse{" +
                "error=" + error +
                '}';
    }

    @Override
    public String toString() {
        return "StockerVentaResponse{" +
                "ok=" + ok +
                ", venta=" + venta +
                ", total='" + total + '\'' +
                ", error=" + error +
                '}';
    }
}
