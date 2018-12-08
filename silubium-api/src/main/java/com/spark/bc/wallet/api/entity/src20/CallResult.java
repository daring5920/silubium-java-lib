package com.spark.bc.wallet.api.entity.src20;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shenzucai
 * @time 2018.12.06 08:37
 */
@NoArgsConstructor
@Data
public class CallResult {


    /**
     * address : 1e88227d9f21cd26ee06f0f1473e119bbf392fc0
     * executionResult : {"gasUsed":39999999,"excepted":"BadInstruction","newAddress":"1e88227d9f21cd26ee06f0f1473e119bbf392fc0","output":"","codeDeposit":0,"gasRefunded":0,"depositSize":0,"gasForDeposit":0}
     * transactionReceipt : {"stateRoot":"0679e05242bb80ffff844a8b7068f47a413c56650b7b2441348e4774d4ef3ff6","gasUsed":39999999,"bloom":"00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000","log":[]}
     */

    private String address;
    private ExecutionResultBean executionResult;
    private TransactionReceiptBean transactionReceipt;
}