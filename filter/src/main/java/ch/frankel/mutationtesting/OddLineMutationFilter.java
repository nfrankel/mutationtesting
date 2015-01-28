package ch.frankel.mutationtesting;

import org.pitest.mutationtest.engine.MutationDetails;
import org.pitest.mutationtest.filter.MutationFilter;

import java.util.Collection;
import java.util.stream.Collectors;

public class OddLineMutationFilter implements MutationFilter {

    @Override
    public Collection<MutationDetails> filter(Collection<MutationDetails> mutations) {
        return mutations.stream()
            .filter(m -> m.getClassLine().getLineNumber() % 2 == 1)
            .collect(Collectors.toList());
    }
}
