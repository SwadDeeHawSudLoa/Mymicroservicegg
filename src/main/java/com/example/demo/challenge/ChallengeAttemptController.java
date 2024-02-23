/*package com.example.demo.challenge;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/challenges")
class ChallengeAttemptController {
    @GetMapping("/{challengeId}")
    public Challenge getChallengeWithParam  
 (@PathVariable("challengeId") Long challengeId, @RequestParam("factorA") int factorA) {
    
    }
}

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/challenges")
class ChallengeController { 
    private final ChallengeGeneratorService challengeGeneratorService;
    @GetMapping("/random")
    Challenge getRandomChallenge() {
 Challenge challenge = challengeGeneratorService.randomChallenge();
        log.info("Generating a random challenge: {}", challenge);
        return challenge;
    }
}
*/