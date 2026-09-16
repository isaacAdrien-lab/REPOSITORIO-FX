package pe.edu.upeu.sysventas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ComboBoxOption {
    String key;
    String Value;

    @Override
    public String toString(){
        return Value;
    }
}
