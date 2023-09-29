package dev.psh0.projectzip;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ProjectZipExport {
    int id();
}
