

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SkillAnalyzer {
    /**
     * TO-DO: Find skills present in one set but not both.
     * For example, if candidateA has {Java, Python} and candidateB has {Python, SQL},
     * the result should be {Java, SQL}.
     \*
     * @param candidateASkills The skills of the first candidate.
     * @param candidateBSkills The skills of the second candidate.
     * @return A new HashSet containing only the unique skills for each candidate.
     */
    public Set<String> findUniqueSkills(Set<String> candidateASkills, Set<String> candidateBSkills) {
        // Hint: You might need to find the union and intersection first.
        // Your code here
        Set<String> unionA=new HashSet<>(candidateASkills);
        unionA.addAll(candidateBSkills);
        Set<String> intersectionA=new HashSet<>(candidateASkills);
        intersectionA.retainAll(candidateBSkills);
        unionA.removeAll(intersectionA);
//        Set<String> differenceOfA=new HashSet<>(candidateASkills);
//        differenceOfA.removeAll(candidateBSkills);
//        Set<String> differenceOfB=new HashSet<>(candidateBSkills);
//        differenceOfB.removeAll(candidateASkills);
//        Set<String> uniqueSkills=new HashSet<>();
//        uniqueSkills.add(differenceOfA.toString());
//        uniqueSkills.add(differenceOfB.toString());

        return unionA; // Placeholder
    }

}