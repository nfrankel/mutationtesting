package ch.frankel.mutationtesting;

import java.util.Properties;
import org.pitest.classpath.CodeSource;
import org.pitest.mutationtest.filter.MutationFilter;
import org.pitest.mutationtest.filter.MutationFilterFactory;

public class OddLineMutationFilterFactory implements MutationFilterFactory {

    @Override
    public String description() {
        return "Mutation Filter Factory";
    }

    @Override
    public MutationFilter createFilter(Properties properties, CodeSource codeSource, int i) {
        return new OddLineMutationFilter();
    }
}
