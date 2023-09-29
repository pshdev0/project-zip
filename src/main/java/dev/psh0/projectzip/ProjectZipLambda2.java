package dev.psh0.projectzip;

import org.json.JSONObject;
import java.io.IOException;

public interface ProjectZipLambda2<T> {
    T run(JSONObject x) throws IOException;
}
