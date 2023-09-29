package dev.psh0.projectzip;

import java.io.IOException;

public interface ProjectZipLambda<T, W> {
    W run(T x) throws IOException;
}
