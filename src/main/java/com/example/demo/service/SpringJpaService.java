package com.example.demo.service;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Branch;
import com.example.demo.repository.BranchRepository;

@Service
public class SpringJpaService {

	private final BranchRepository branchRepository;

	public SpringJpaService(BranchRepository branchRepository) {
		super();
		this.branchRepository = branchRepository;
	}

	@Nullable
	public Branch saveBranch(@NonNull final Branch branch) {
		Branch result = branchRepository.save(branch);
		return branchRepository.findById(result.getId()).orElse(null);
	}
}
