package io.mosip.registrationprocessor.dummyservice.entity;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data

/* (non-Javadoc)
 * @see io.mosip.registration.processor.core.common.rest.dto.BaseRestRequestDTO#hashCode()
 */
@EqualsAndHashCode(callSuper = true)
public class MessageRequestDTO extends BaseRestRequestDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7914304502765754692L;
	/** The request. */
	private List<MessageDTO> request;
}
