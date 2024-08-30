package com.hospital.patient.modal;

import lombok.*;

import java.util.UUID;

@Data // for setter and getter methods
//@Setter // for setter methods
//@Getter // for getter methods
@NoArgsConstructor
@AllArgsConstructor
public class Inc {

    private UUID id;
    private String patientName;
    private Integer IncNo;
}
