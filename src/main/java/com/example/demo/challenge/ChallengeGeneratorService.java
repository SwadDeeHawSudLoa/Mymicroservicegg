package com.example.demo.challenge;

import org.bouncycastle.asn1.cmp.Challenge;

public interface ChallengeGeneratorService {
    /**
     * @return a randomly-generated challenge with factors between 11 and 99
     */
    Challenge randomChallenge();
}
